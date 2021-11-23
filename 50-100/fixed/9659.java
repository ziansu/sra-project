public void findMinFormat() {
    if ((isEmptyHeap()) == true) {
        java.lang.System.out.println("There are no ideas here");
    }else {
        java.lang.System.out.println(((((("The best idea is Idea #" + (heap[0].getSeqNum())) + "/nrated at") + (heap[0].getRating())) + "here is the description: /n") + (heap[0].getDesc())));
    }
}