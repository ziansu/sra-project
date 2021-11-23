@org.junit.jupiter.api.Test
void pivot2() {
    expected = linkedlists.LinkedListUtil.createLinkedList(3, 3, 3, 2, 2, 2, 1, 1, 1);
    input = linkedlists.LinkedListUtil.createLinkedList(2, 2, 3, 3, 3, 2, 1, 1, 1);
    k = 4;
    test(expected, input, k);
}