@java.lang.Override
public void propertyIsUnowned(java.lang.String propertyName, int propertyValue) {
    if (propertyValue == 1) {
        game.purchaseProperty("testPlayer", propertyName);
    }else {
    }
}