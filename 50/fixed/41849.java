@java.lang.Override
public void decreaseResourceAmount(client.domestic.ResourceType resource) {
    changeValueOfResourceByInt(resource, 1);
    checkTradeValues();
    checkResourceChanges();
}