@org.springframework.web.bind.annotation.RequestMapping(value = "/api/card", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public com.babydear.dto.CardListDTO selectCards(java.lang.Long uId, com.babydear.model.User user) {
    java.lang.System.out.println("it's uId");
    java.util.List<com.babydear.model.Card> cardList = cardRepo.findAllByOrderByCIdDesc();
    java.util.List<com.babydear.model.Card> cardResponseList = new java.util.ArrayList<com.babydear.model.Card>();
    for (com.babydear.model.Card card : cardList) {
        if (!(card.getDeleted())) {
            cardResponseList.add(card);
        }
    }
    com.babydear.dto.CardListDTO cardListDTO = new com.babydear.dto.CardListDTO();
    cardListDTO.setCardList(cardResponseList);
    return cardListDTO;
}