@org.junit.Before
public void setUp() {
    setUpMocks();
    buySpecification = getOrderSpecification(testInstrument, OrderCommand.BUY, 0.25);
    buySpecification2 = getOrderSpecification(testInstrument, OrderCommand.BUY, 0.37);
    sellSpecification = getOrderSpecification(testInstrument, OrderCommand.SELL, 0.25);
    sellSpecification2 = getOrderSpecification(testInstrument, OrderCommand.SELL, 0.39);
    externalSpecification = getOrderSpecification(testInstrument2, OrderCommand.SELL, 0.775);
    buyOrder = com.jforex.programming.mock.IOrderBuilder.fromOrderSpecification(buySpecification);
    externalOrder = com.jforex.programming.mock.IOrderBuilder.fromOrderSpecification(externalSpecification);
    positionManager = new com.jforex.programming.position.JFPositionManager(orderUtilMock);
}