private int getOperandSize(int i) {
    java.lang.String str = ((java.lang.String) (guiConfig.SourceTable.getValueAt(i, 2)));
    if (str != null)
        if (str.startsWith("\'"))
            return (str.length()) - 2;
        else
            try {
                int op = java.lang.Integer.parseInt(str);
                return op;
            } catch (java.lang.Exception e) {
                print1stScanError(("operand parsing error! " + i));
                return 0;
            }
        
    
    print1stScanError(("operand parsing error " + i));
    return 0;
}