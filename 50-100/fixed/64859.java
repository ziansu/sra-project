@org.junit.jupiter.api.Test
void pivot3() {
    expected = linkedlists.LinkedListUtil.createLinkedList(3, 3, 3, 2, 2, 2, 1, 1, 1);
    input = linkedlists.LinkedListUtil.createLinkedList(1, 1, 1, 2, 2, 2, 3, 3, 3);
    k = 2;
    test(expected, input, k);
}