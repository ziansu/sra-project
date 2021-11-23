@org.codehaus.jackson.annotate.JsonIgnore
public void update(int total, java.lang.String workingPoint, int inconsistencyCount) {
    (this.checkedCount)++;
    this.progress = ((int) (((this.checkedCount) * 100) / total));
    this.workingPoint = workingPoint;
    this.inconsistencyCount = inconsistencyCount;
}