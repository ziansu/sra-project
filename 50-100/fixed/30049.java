@java.lang.Override
public boolean isApplicable(com.intellij.openapi.actionSystem.AnActionEvent event, final java.util.Map<java.lang.String, java.lang.Object> _params) {
    java.lang.String[] hints = ((jetbrains.mps.nodeEditor.EditorComponent) (jetbrains.mps.internal.collections.runtime.MapSequence.fromMap(_params).get("editorComponent"))).getUpdater().getExplicitEditorHintsForNode(((org.jetbrains.mps.openapi.model.SNode) (jetbrains.mps.internal.collections.runtime.MapSequence.fromMap(_params).get("node"))).getReference());
    return hints == null ? true : !(java.util.Arrays.asList(hints).contains("jetbrains.mps.lang.core.editor.BaseEditorContextHints.reflectiveEditor"));
}