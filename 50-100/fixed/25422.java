@com.cascada.controller.RequestMapping(value = "empleado/crearEmpleado", method = RequestMethod.POST)
public java.lang.String guardarEmpleado(com.cascada.domain.EmpleadoEntity empleadoEntity, com.cascada.domain.EmpleadoIngresoEntity empleadoIngresoEntity, org.springframework.ui.Model model) {
    com.cascada.domain.EmpleadoEntity empleadoCreado = empleadoService.saveEmpleado(empleadoEntity);
    com.cascada.domain.EmpleadoEntity empleado = empleadoService.findEmpleado(empleadoCreado.getEmpleadoId());
    empleadoIngresoService.saveEmpleadoIngreso(empleadoIngresoEntity, empleado.getEmpleadoId());
    return "redirect:/empleado/";
}