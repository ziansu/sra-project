private void deleteLastGraph(int phase) {
    int index = (this.phases[(phase - 1)].getData().size()) - 1;
    this.phases[(phase - 1)].getData().remove(index);
    (this.phaseCounter)--;
}