public void associateWithClassOrType(wyvern.tools.typedAST.core.binding.typechecking.TypeBinding t) {
    this.tagType = t.getType();
    wyvern.tools.typedAST.core.expressions.TaggedInfo.globalTagStore.put(t, this);
    wyvern.tools.typedAST.core.expressions.TaggedInfo.globalTagStoreList.add(this);
}