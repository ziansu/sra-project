private void changePivot() {
    changeColor(pivot, "green");
    boolean con = true;
    int i = 0;
    while (con) {
        if ((i >= (sorteren.model.DataList.size)) || (i < 0)) {
            done = true;
        }else
            if ((sorted[i]) == false) {
                pivot = i;
                sorted[pivot] = true;
                step = 0;
                compare = pivot;
                incrementCompare();
                con = false;
            }
        
        i++;
    } 
}