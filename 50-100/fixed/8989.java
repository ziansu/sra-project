public static void main(java.lang.String[] args) {
    Print_Nodes_in_Top_View_of_Binary_Tree solution = new Print_Nodes_in_Top_View_of_Binary_Tree();
    Serialize_and_Deserialize_Binary_Tree treeBuild = new Serialize_and_Deserialize_Binary_Tree();
    TreeNode root = treeBuild.deserializeBFS("1 2 3 4 5 6 7");
    java.lang.System.out.println(solution.topView(root));
    root = treeBuild.deserializeBFS("1 2 3 # 4 # # # 5 # 6");
    java.lang.System.out.println(solution.topView(root));
}