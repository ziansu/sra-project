@java.lang.Override
public java.util.List<br.edu.ifpb.ajudeMais.domain.entity.InstituicaoCaridade> filtersInstituicaoCloseForLatAndLng(br.edu.ifpb.ajudeMais.service.maps.dto.LatLng latLng) throws br.edu.ifpb.ajudeMais.service.exceptions.AjudeMaisException {
    br.edu.ifpb.ajudeMais.domain.entity.Endereco endereco;
    endereco = googleMapsResponse.converteLatitudeAndLongitudeInAddress(latLng.getLatitude(), latLng.getLongitude());
    return instituicaoRespository.filtersInstituicaoCaridadeClose(endereco.getLocalidade(), endereco.getUf());
}