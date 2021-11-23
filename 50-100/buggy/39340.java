private void removeLastFrame() {
    me.enerccio.sp.interpret.FrameObject o = this.currentFrame.removeLast();
    if ((o.parentFrame) != null) {
        o.parentFrame.returnHappened = o.returnHappened;
        o.parentFrame.stack.add(o);
    }else {
        if ((currentFrame.size()) == 0)
            throw new me.enerccio.sp.interpret.PythonExecutionException(o.exception);
        
        currentFrame.peekLast().exception = o.exception;
    }
}