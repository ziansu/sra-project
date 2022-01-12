@org.junit.jupiter.api.Test
void pivot2() {
    expected = linkedlists.LinkedListUtil.createLinkedList(1, 1, 1, 3, 3, 3, 2, 2, 2);
    input = linkedlists.LinkedListUtil.createLinkedList(3, 3, 3, 2, 2, 2, 1, 1, 1);
    k = 1;
    test(expected, input, k);
}