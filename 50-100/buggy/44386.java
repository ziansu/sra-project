@java.lang.Override
protected spirite.image_data.UndoEngine.UndoAction iterateNext() {
    java.lang.System.out.println(actions.size());
    if (!(iter.hasNext())) {
        spirite.MDebug.handleError(ErrorType.STRUCTURAL, this, "Undo Outer queue desynced with inner queue (Null Redo).");
        return null;
    }else {
        spirite.image_data.UndoEngine.CompositeAction composite = iter.next();
        for (spirite.image_data.UndoEngine.UndoContext context : composite.contexts)
            context.iterateNext();
        
        return composite;
    }
}