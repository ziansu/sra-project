private void checkControllerStateShouldNotEqual(controller.UIController notExpected, controller.UIController actual) {
    assertFalse((notExpected == actual));
    assertEquals(notExpected.getCurrentPlayer(), actual.getCurrentPlayer());
    assertNotEquals(notExpected.getAllStacks(), actual.getAllStacks());
    assertNotEquals(notExpected.getRoundState(), actual.getRoundState());
    assertNotEquals(notExpected.getDiscardPile(), actual.getDiscardPile());
    assertNotEquals(notExpected.getDrawPile(), actual.getDrawPile());
}