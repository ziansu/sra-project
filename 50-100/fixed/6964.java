public void setDataTermino(java.lang.String dataTermino) {
    int dia = java.lang.Integer.parseInt(dataTermino.substring(0, 2));
    int mes = (java.lang.Integer.parseInt(dataTermino.substring(3, 5))) - 1;
    int ano = java.lang.Integer.parseInt(dataTermino.substring(6));
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.set(ano, mes, dia);
    this.dataTermino = c;
}