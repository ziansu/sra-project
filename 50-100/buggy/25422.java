@com.cascada.controller.RequestMapping(value = "empleado/crearEmpleado", method = RequestMethod.POST)
public java.lang.String guardarEmpleado(com.cascada.domain.EmpleadoEntity empleadoEntity, com.cascada.domain.EmpleadoIngresoEntity empleadoIngresoEntity, org.springframework.ui.Model model) {
    com.cascada.domain.EmpleadoEntity empleadoCreado = empleadoService.saveEmpleado(empleadoEntity);
    com.cascada.domain.EmpleadoEntity empleado = empleadoService.findEmpleado(empleadoCreado.getEmpleadoId());
    model.addAttribute("test", empleado.getEmpleadoId());
    empleadoIngresoService.saveEmpleadoIngreso(empleadoIngresoEntity, empleado.getEmpleadoId());
    return "redirect:/empleado/";
}