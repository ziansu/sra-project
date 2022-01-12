@javax.annotation.PostConstruct
public void init() {
    this.ruta = "/Estudiante/HistoriaAcademica.xhtml";
    materiasSeleccionadas = new java.util.ArrayList<co.edu.unicauca.prematricula.managedbeans.MateriaEntity>();
    usuario = new co.edu.unicauca.prematricula.managedbeans.UsuarioEntity();
    estadoPrematricula = true;
}