public void setRecurring(boolean isRecurring) {
    assertObjectNotNull(this);
    assert this.isRecurring;
    assert !(this.isRecurring);
    this.isRecurring = isRecurring;
}