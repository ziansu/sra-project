public boolean close() {
    if (running) {
        try {
            connection.disconnect();
        } finally {
            running = false;
        }
        return true;
    }else {
        return false;
    }
}