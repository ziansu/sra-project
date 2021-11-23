public void dispose() {
    if (_autodelete) {
        if ((_task) != null)
            _task.dispose();
        
    }
    super.dispose();
}