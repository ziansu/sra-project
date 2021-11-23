private boolean eq() {
    if (memory.pop().equals(memory.pop())) {
        memory.push("true");
        return true;
    }else {
        memory.pop();
        memory.pop();
        memory.push("false");
        return false;
    }
}