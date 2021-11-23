@java.lang.Override
public java.lang.String getRecordCounts(java.lang.String managerID) {
    java.lang.System.out.println("MTL count Called");
    int counter = 0;
    if ((srtrRecords.size()) > 0) {
        for (int i = 65; i < 91; i++) {
            java.lang.String key = java.lang.Character.toString(((char) (i)));
            java.util.ArrayList<java.lang.Object> array = srtrRecords.get(key);
            counter += array.size();
        }
        return "" + counter;
    }else {
        return "0";
    }
}