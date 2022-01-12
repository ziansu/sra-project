@ru.yandex.qatools.allure.annotations.Step(value = "Пользователь указывает номер игрока")
private void userTypePlayerNumber() {
    java.util.Random random = new java.util.Random();
    type(playerNumber, java.lang.Integer.toString(((random.nextInt(99)) + 1)));
}