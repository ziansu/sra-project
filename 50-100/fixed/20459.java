private java.lang.String tipoNextAt(int j) {
    int nProfAt = 0;
    for (int i = 0; i < (cant_empleados); i++) {
        if ((tipoAt.get(i)) == "prof") {
            nProfAt++;
        }
    }
    if (nProfAt < (nProf)) {
        return "prof";
    }else {
        return "alu";
    }
}