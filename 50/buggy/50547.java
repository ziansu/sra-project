public static Decks.DeckManagerComponent.CardAction fromDTO(Decks.DeckManagerComponent.DTOs.CardActionDTO dto) {
    Decks.DeckManagerComponent.CardAction cardAction = Decks.DeckManagerComponent.CardAction.valueOf(dto.getName());
    return Decks.DeckManagerComponent.CardAction.createAction(dto.getNumber(), cardAction);
}