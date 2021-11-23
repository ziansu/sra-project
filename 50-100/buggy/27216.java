@java.lang.Override
public void run() {
    java.lang.System.out.println("Iniciar Escucha!!!");
    while (estado) {
        java.lang.String content = correos.acropolis.correo.ClientePOP.readMail();
        if (content != null) {
            java.lang.System.out.println("Llego Correo!!!");
            correos.acropolis.CorreosTecno.HiloAtencion atender = new correos.acropolis.CorreosTecno.HiloAtencion();
            atender.mensaje = content;
            atender.start();
        }
        waitCiclo();
    } 
    java.lang.System.out.println("Terminar Escucha!!!");
}