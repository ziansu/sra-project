private void transformAccessoryToTarget(com.lumens.processor.transform.MapperContext ctx, com.lumens.model.Element rootDst) {
    rootDst.passAccessory(ctx.getRoot().getAccessoryManager());
}