@org.springframework.web.bind.annotation.RequestMapping(value = "/customer/addresses/new/wallet", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public com.neemre.bitplexus.common.dto.AddressDto viewShowCreateNew1(org.springframework.ui.ModelMap model) throws com.neemre.bitplexus.backend.crypto.NodeWrapperException {
    return addressService.createNewWalletAddress(new com.neemre.bitplexus.common.dto.AddressDto(null, 16, null, null, null, null, null, null, null), false, "LITECOIN_TEST3");
}