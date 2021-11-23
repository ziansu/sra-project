@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<com.wenting.model.Item> createNewItem(@org.springframework.web.bind.annotation.RequestBody
com.wenting.api.request.NewItem newItem) {
    com.wenting.model.Item item = new com.wenting.model.Item();
    item.setText(newItem.getText());
    itemRepository.save(item);
    com.wenting.model.Item response = itemRepository.findById(item.getId());
    return new org.springframework.http.ResponseEntity<com.wenting.model.Item>(response, org.springframework.http.HttpStatus.CREATED);
}