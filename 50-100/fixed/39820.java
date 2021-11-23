@org.junit.Test
@java.lang.SuppressWarnings(value = "unchecked")
public void testKeepSearchingDFS_MaxSize_Pass() {
    int size = (boardSize) - 1;
    java.util.Stack<me.valesken.jeff.sudoku_model.Tile> mockStack = ((java.util.Stack<me.valesken.jeff.sudoku_model.Tile>) (org.mockito.Mockito.mock(java.util.Stack.class)));
    org.mockito.Mockito.when(mockStack.size()).thenReturn(size);
    org.junit.Assert.assertTrue(board.keepSearching_DFS(mockStack));
}