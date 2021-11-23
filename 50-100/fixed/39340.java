private void removeLastFrame() {
    me.enerccio.sp.interpret.FrameObject o = this.currentFrame.removeLast();
    if ((o.parentFrame) != null) {
        o.parentFrame.returnHappened = o.returnHappened;
        o.parentFrame.stack.add(o);
    }else {
        if ((currentFrame.size()) == 0) {
            if ((o.exception) != null)
                throw new me.enerccio.sp.interpret.PythonExecutionException(o.exception);
            
        }else
            currentFrame.peekLast().exception = o.exception;
        
    }
}