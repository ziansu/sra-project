public static void main(java.lang.String[] args) {
    com.kaushik.AlgorithmUtility.linkedlistalgos.LinkedListAlgos algos = new com.kaushik.AlgorithmUtility.linkedlistalgos.LinkedListAlgos();
    int[] arr = new int[]{ 1 , 1 , 1 };
    com.kaushik.AlgorithmUtility.entities.LinkedlistNode<java.lang.Integer> head = algos.constructLinkedListFromArray(arr);
    algos.printLinkedList(head);
    algos.removeDups(head);
    algos.printLinkedList(head);
}