public org.springframework.hateoas.Link getGoodsInPurchaseOrderLink(java.lang.String orderNumber) {
    org.springframework.hateoas.UriTemplate uriTemplate = new org.springframework.hateoas.UriTemplate(java.lang.String.format("%s/%s/goods/{goods}/price-list/{priceList}", org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo(it.valeriovaudi.emarket.endpoint.restfull.GoodsInPurchaseOrderRestFullEndPoint.class), orderNumber));
    return new org.springframework.hateoas.Link(uriTemplate, it.valeriovaudi.emarket.hateoas.AbstractHateoasFactoryConstants.GOODS_IN_PURCHASE_ORDER_LINK_KEY);
}