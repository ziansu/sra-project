public static void main(java.lang.String[] args) throws net.sf.jasperreports.engine.JRException {
    java.util.HashMap<java.lang.String, java.lang.Object> paramters = new java.util.HashMap<java.lang.String, java.lang.Object>();
    paramters.put("P_MES", 12);
    paramters.put("P_SECTOR", 1);
    paramters.put("P_ANO", 4);
    paramters.put("P_DIRE", "010301010101041");
    ReportHelper.exportTXT("EstadoAvancePresupuestalEgresosFinalidadFuncionProgramaProyectoFf", paramters);
}