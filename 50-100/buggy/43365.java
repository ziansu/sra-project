@org.junit.Test
public void should_add_right_goods_given_barcode_and_goods() {
    tw.thoughtpos.domain.Goods goods = new tw.thoughtpos.domain.Goods(tw.thoughtpos.service.DefaultGoodsServiceTest.BARCODE);
    goods.setName("pen");
    goods.setPrice(30.0);
    goods.setUnit("支");
    org.mockito.Mockito.when(defaultGoodsService.addGoods(goods)).thenReturn(goods);
    org.hamcrest.MatcherAssert.assertThat(goodsRepository.save(goods), org.hamcrest.core.Is.is(goods));
}