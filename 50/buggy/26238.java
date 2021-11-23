protected void emit(com.johnsimon.payback.data.AppData data) {
    this.data = data;
    subscription.broadcast(data);
}