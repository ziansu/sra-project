public void acceptProposal(java.lang.String key) {
    dev.blunch.blunch.domain.CollaborativeMenuAnswer answer = collaborativeMenuAnswerRepository.get(key);
    dev.blunch.blunch.domain.CollaborativeMenu menuHost = repository.get(answer.getMenuId());
    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : answer.getOfferedDishes().entrySet()) {
        menuHost.addOfferedDish(entry.getKey());
    }
    collaborativeMenuAnswerRepository.delete(key);
}