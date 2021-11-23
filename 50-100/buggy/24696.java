@org.codehaus.jackson.annotate.JsonIgnore
public void update(int total, java.lang.String workingPoint, int inconsistencyCount) {
    (this.checkedCount)++;
    this.progress = ((int) (((this.checkedCount) / total) * 100));
    this.workingPoint = workingPoint;
    this.inconsistencyCount = inconsistencyCount;
}