@java.lang.Override
public java.lang.Class<?> getColumnClass(int columnIndex) {
    switch (columnIndex) {
        case tolteco.sigma.model.tables.UsuarioTable.USER_ID :
            return java.lang.Integer.class;
        case tolteco.sigma.model.tables.UsuarioTable.USER_NAME :
            return java.lang.String.class;
        case tolteco.sigma.model.tables.UsuarioTable.ACCESS_LEVEL :
            return tolteco.sigma.model.entidades.Access.class;
        case tolteco.sigma.model.tables.UsuarioTable.PASS :
            return char[].class;
        default :
            throw new java.lang.IndexOutOfBoundsException((((("Exceeded Max Column Count: " + columnIndex) + " out of ") + (tolteco.sigma.model.tables.UsuarioTable.COLUMN_COUNT)) + "."));
    }
}