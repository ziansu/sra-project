public java.lang.Object getValueAt(int arg0, int arg1) {
    if (arg1 == 0) {
        return ((studio.kdb.K.KBaseVector) (dict.x)).at(arg0);
    }else
        if (arg1 == 1) {
            return ((studio.kdb.K.KBaseVector) (dict.y)).at(arg0);
        }else {
            return null;
        }
    
}