private void deleteLastGraph(int phase) {
    (this.phaseCounter)--;
    int index = (this.phases[(phase - 1)].getData().size()) - 1;
    this.phases[(phase - 1)].getData().remove(index);
}