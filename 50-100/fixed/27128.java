public void printPatients() {
    Patient current = this.firstPatient;
    if ((firstPatient) != null) {
        while ((current.getNextPatient()) != null) {
            java.lang.System.out.println(current.getName());
            current = current.getNextPatient();
        } 
        java.lang.System.out.println(current.getName());
    }else {
        java.lang.System.out.println("Null");
    }
}