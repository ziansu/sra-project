@java.lang.Override
public boolean isTrue(burlap.oomdp.core.State s, java.lang.String[] params) {
    burlap.oomdp.core.ObjectInstance block = s.getObject(params[0]);
    int blockType = block.getIntValForAttribute(HelperNameSpace.ATBTYPE);
    return (HelperActions.blockColorMap.get(blockType)) == (this.color);
}