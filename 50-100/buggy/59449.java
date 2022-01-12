@java.lang.Override
public int getChildrenCount(int groupPosition) {
    java.lang.String pzName = this.listDataHeader.keySet().toArray()[groupPosition].toString();
    int count = this.listDataChild.get(pzName).size();
    java.lang.System.out.println(count);
    return count;
}