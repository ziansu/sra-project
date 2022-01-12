public java.lang.Object getValueAt(int row, int col) {
    Download obj = downloadList.get(row);
    switch (col) {
        case 0 :
            return obj.getUrlName();
        case 1 :
            int i = obj.getSize();
            return i == (-1) ? "" : java.lang.Integer.toString(i);
        case 2 :
            return ((java.lang.Float) (obj.getProgress()));
        case 3 :
            return obj.STATUS[obj.getStatus()];
    }
    return "";
}