public java.lang.Object getValueAt(int arg0, int arg1) {
    if (arg1 == 0) {
        return x.at(arg0);
    }else
        if (arg1 == 1) {
            return y.at(arg0);
        }else {
            return null;
        }
    
}