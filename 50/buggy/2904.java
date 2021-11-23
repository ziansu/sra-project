public static void clearGlobalTaggedInfos() {
    wyvern.tools.typedAST.core.expressions.TaggedInfo.globalTagStore = new java.util.HashMap<wyvern.tools.typedAST.core.binding.typechecking.TypeBinding, wyvern.tools.typedAST.core.expressions.TaggedInfo>();
    wyvern.tools.typedAST.core.expressions.TaggedInfo.globalTagStoreList = new java.util.ArrayList<wyvern.tools.typedAST.core.expressions.TaggedInfo>();
}