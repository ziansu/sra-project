public java.util.List<cn.vicey.navigator.Models.Nodes.GuideNode> findGuideNodes(@android.support.annotation.NonNull
final java.lang.String pattern) {
    if (cn.vicey.navigator.Utils.Tools.isStringEmpty(pattern, true))
        return new java.util.ArrayList<>();
    
    java.util.List<cn.vicey.navigator.Models.Nodes.GuideNode> result = new java.util.ArrayList<>();
    for (cn.vicey.navigator.Models.Nodes.GuideNode node : mGuideNodes) {
        if ((node.getName()) == null)
            continue;
        
        if (node.getName().toLowerCase().contains(pattern.toLowerCase()))
            result.add(node);
        
    }
    return result;
}