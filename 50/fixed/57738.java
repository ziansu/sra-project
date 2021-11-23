@java.lang.Override
public void handle(javafx.scene.input.MouseEvent t) {
    model.cardBuy(me, cardname);
    main.control_buy_card(cardname);
}