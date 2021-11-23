private void transformAccessoryToTarget(com.lumens.processor.transform.MapperContext ctx, com.lumens.model.Element rootDst) {
    com.lumens.model.Element rootSrc = com.lumens.processor.script.ScriptUtils.getStartElement(ctx);
    rootDst.passAccessory(rootSrc);
    rootDst.passAccessory(ctx.getRoot().getAccessoryManager());
}