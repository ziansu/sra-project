@org.junit.Test
public void should_find_right_goods_given_barcode() {
    tw.thoughtpos.domain.Goods expectedGoods = new tw.thoughtpos.domain.Goods(tw.thoughtpos.service.DefaultGoodsServiceTest.BARCODE);
    org.mockito.Mockito.when(defaultGoodsService.findGoods(tw.thoughtpos.service.DefaultGoodsServiceTest.BARCODE)).thenReturn(expectedGoods);
    org.hamcrest.MatcherAssert.assertThat(goodsRepository.findOne(tw.thoughtpos.service.DefaultGoodsServiceTest.BARCODE), org.hamcrest.core.Is.is(expectedGoods));
}