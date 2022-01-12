private com.minasan.zenki.services.impl.MocksGeneratorServiceImpl.PlayerDistributionMock generatePlayerMock(java.util.List<com.minasan.zenki.services.impl.UserTO> users, com.minasan.zenki.services.impl.UserTO userData) {
    com.minasan.zenki.services.impl.MocksGeneratorServiceImpl.PlayerDistributionMock result;
    if (users.isEmpty()) {
        result = generateFirstPlayerDistribution(userData);
    }else
        if ((users.size()) == 1) {
            result = generateSecondPlayerDistribution(userData);
        }else {
            result = generateAnyOtherPlayerDistribution(userData);
        }
    
    return result;
}